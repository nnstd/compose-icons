package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotebookRemoveOutline: ImageVector
    get() {
        if (_NotebookRemoveOutline != null) {
            return _NotebookRemoveOutline!!
        }
        _NotebookRemoveOutline = ImageVector.Builder(
            name = "NotebookRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineTo(10f)
                lineTo(15f, 8f)
                lineTo(13f, 10f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(12.1f)
                curveTo(12.2f, 20.7f, 12.5f, 21.4f, 12.8f, 22f)
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
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 2.9f, 5.9f, 2f, 7f, 2f)
                horizontalLineTo(19f)
                curveTo(20f, 2f, 21f, 3f, 21f, 4f)
                verticalLineTo(13.8f)
                curveTo(20.4f, 13.4f, 19.7f, 13.2f, 19f, 13.1f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
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
                moveTo(5f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(20.1f, 15.5f)
                lineTo(18f, 17.6f)
                lineTo(15.9f, 15.5f)
                lineTo(14.5f, 16.9f)
                lineTo(16.6f, 19f)
                lineTo(14.5f, 21.1f)
                lineTo(15.9f, 22.5f)
                lineTo(18f, 20.4f)
                lineTo(20.1f, 22.5f)
                lineTo(21.5f, 21.1f)
                lineTo(19.4f, 19f)
                lineTo(21.5f, 16.9f)
                lineTo(20.1f, 15.5f)
                close()
            }
        }.build()

        return _NotebookRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookRemoveOutline: ImageVector? = null
