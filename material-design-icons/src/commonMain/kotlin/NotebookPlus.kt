package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotebookPlus: ImageVector
    get() {
        if (_NotebookPlus != null) {
            return _NotebookPlus!!
        }
        _NotebookPlus = ImageVector.Builder(
            name = "NotebookPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 2.9f, 5.9f, 2f, 7f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                lineTo(15.5f, 7.5f)
                lineTo(18f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                curveTo(20f, 2f, 21f, 3f, 21f, 4f)
                verticalLineTo(13.8f)
                curveTo(20.1f, 13.3f, 19.1f, 13f, 18f, 13f)
                curveTo(14.7f, 13f, 12f, 15.7f, 12f, 19f)
                curveTo(12f, 20.1f, 12.3f, 21.1f, 12.8f, 22f)
                horizontalLineTo(7f)
                curveTo(5.9f, 22f, 5f, 21f, 5f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(5f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(17f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _NotebookPlus!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookPlus: ImageVector? = null
