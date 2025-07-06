package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaperclipCheck: ImageVector
    get() {
        if (_PaperclipCheck != null) {
            return _PaperclipCheck!!
        }
        _PaperclipCheck = ImageVector.Builder(
            name = "PaperclipCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 21.36f)
                curveTo(13.7f, 21.84f, 13.97f, 22.29f, 14.29f, 22.7f)
                curveTo(13.73f, 22.89f, 13.13f, 23f, 12.5f, 23f)
                curveTo(9.46f, 23f, 7f, 20.54f, 7f, 17.5f)
                verticalLineTo(5f)
                curveTo(7f, 2.79f, 8.79f, 1f, 11f, 1f)
                reflectiveCurveTo(15f, 2.79f, 15f, 5f)
                verticalLineTo(14.54f)
                curveTo(14.03f, 15.41f, 13.35f, 16.58f, 13.1f, 17.92f)
                curveTo(12.91f, 17.97f, 12.71f, 18f, 12.5f, 18f)
                curveTo(11.12f, 18f, 10f, 16.88f, 10f, 15.5f)
                verticalLineTo(6f)
                horizontalLineTo(11.5f)
                verticalLineTo(15.5f)
                curveTo(11.5f, 16.05f, 11.95f, 16.5f, 12.5f, 16.5f)
                reflectiveCurveTo(13.5f, 16.05f, 13.5f, 15.5f)
                verticalLineTo(5f)
                curveTo(13.5f, 3.62f, 12.38f, 2.5f, 11f, 2.5f)
                reflectiveCurveTo(8.5f, 3.62f, 8.5f, 5f)
                verticalLineTo(17.5f)
                curveTo(8.5f, 19.71f, 10.29f, 21.5f, 12.5f, 21.5f)
                curveTo(12.84f, 21.5f, 13.17f, 21.44f, 13.5f, 21.36f)
                moveTo(18f, 6f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.55f)
                curveTo(16.97f, 13.34f, 17.47f, 13.18f, 18f, 13.09f)
                verticalLineTo(6f)
                moveTo(21.34f, 15.84f)
                lineTo(17.75f, 19.43f)
                lineTo(16.16f, 17.84f)
                lineTo(15f, 19f)
                lineTo(17.75f, 22f)
                lineTo(22.5f, 17.25f)
                lineTo(21.34f, 15.84f)
                close()
            }
        }.build()

        return _PaperclipCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipCheck: ImageVector? = null
