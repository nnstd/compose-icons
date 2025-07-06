package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotebookEditOutline: ImageVector
    get() {
        if (_NotebookEditOutline != null) {
            return _NotebookEditOutline!!
        }
        _NotebookEditOutline = ImageVector.Builder(
            name = "NotebookEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 14.88f)
                lineTo(21.12f, 16.93f)
                lineTo(15.06f, 23f)
                horizontalLineTo(13f)
                verticalLineTo(20.94f)
                lineTo(19.07f, 14.88f)
                moveTo(21.04f, 13.13f)
                curveTo(21.18f, 13.13f, 21.31f, 13.19f, 21.42f, 13.3f)
                lineTo(22.7f, 14.58f)
                curveTo(22.92f, 14.79f, 22.92f, 15.14f, 22.7f, 15.35f)
                lineTo(21.7f, 16.35f)
                lineTo(19.65f, 14.3f)
                lineTo(20.65f, 13.3f)
                curveTo(20.76f, 13.19f, 20.9f, 13.13f, 21.04f, 13.13f)
                moveTo(17f, 4f)
                verticalLineTo(10f)
                lineTo(15f, 8f)
                lineTo(13f, 10f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                curveTo(5.95f, 22f, 5f, 21.05f, 5f, 20f)
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
                curveTo(5f, 2.89f, 5.9f, 2f, 7f, 2f)
                horizontalLineTo(19f)
                curveTo(20.05f, 2f, 21f, 2.95f, 21f, 4f)
                verticalLineTo(10f)
                lineTo(19f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                moveTo(5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(5f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(5f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _NotebookEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookEditOutline: ImageVector? = null
