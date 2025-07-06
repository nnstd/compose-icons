package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaperclipRemove: ImageVector
    get() {
        if (_PaperclipRemove != null) {
            return _PaperclipRemove!!
        }
        _PaperclipRemove = ImageVector.Builder(
            name = "PaperclipRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13.09f)
                curveTo(17.47f, 13.18f, 16.97f, 13.34f, 16.5f, 13.55f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(13.09f)
                moveTo(11f, 1f)
                curveTo(8.79f, 1f, 7f, 2.79f, 7f, 5f)
                verticalLineTo(17.5f)
                curveTo(7f, 20.54f, 9.46f, 23f, 12.5f, 23f)
                curveTo(13.13f, 23f, 13.73f, 22.89f, 14.29f, 22.7f)
                curveTo(13.97f, 22.29f, 13.7f, 21.84f, 13.5f, 21.36f)
                curveTo(13.17f, 21.44f, 12.84f, 21.5f, 12.5f, 21.5f)
                curveTo(10.29f, 21.5f, 8.5f, 19.71f, 8.5f, 17.5f)
                verticalLineTo(5f)
                curveTo(8.5f, 3.62f, 9.62f, 2.5f, 11f, 2.5f)
                reflectiveCurveTo(13.5f, 3.62f, 13.5f, 5f)
                verticalLineTo(15.5f)
                curveTo(13.5f, 16.05f, 13.05f, 16.5f, 12.5f, 16.5f)
                reflectiveCurveTo(11.5f, 16.05f, 11.5f, 15.5f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(15.5f)
                curveTo(10f, 16.88f, 11.12f, 18f, 12.5f, 18f)
                curveTo(12.71f, 18f, 12.91f, 17.97f, 13.1f, 17.92f)
                curveTo(13.35f, 16.58f, 14.03f, 15.41f, 15f, 14.54f)
                verticalLineTo(5f)
                curveTo(15f, 2.79f, 13.21f, 1f, 11f, 1f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _PaperclipRemove!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipRemove: ImageVector? = null
