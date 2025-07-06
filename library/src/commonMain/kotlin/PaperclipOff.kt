package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaperclipOff: ImageVector
    get() {
        if (_PaperclipOff != null) {
            return _PaperclipOff!!
        }
        _PaperclipOff = ImageVector.Builder(
            name = "PaperclipOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 5.3f)
                lineTo(7.16f, 3.96f)
                curveTo(7.62f, 2.26f, 9.15f, 1f, 11f, 1f)
                curveTo(13.21f, 1f, 15f, 2.79f, 15f, 5f)
                verticalLineTo(11.8f)
                lineTo(13.5f, 10.3f)
                verticalLineTo(5f)
                curveTo(13.5f, 3.62f, 12.38f, 2.5f, 11f, 2.5f)
                reflectiveCurveTo(8.5f, 3.62f, 8.5f, 5f)
                verticalLineTo(5.3f)
                moveTo(18f, 6f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.3f)
                lineTo(18f, 14.8f)
                verticalLineTo(6f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.62f, 19.5f)
                curveTo(16.81f, 21.55f, 14.83f, 23f, 12.5f, 23f)
                curveTo(9.46f, 23f, 7f, 20.54f, 7f, 17.5f)
                verticalLineTo(8.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11.5f, 15.5f)
                curveTo(11.5f, 16.05f, 11.95f, 16.5f, 12.5f, 16.5f)
                reflectiveCurveTo(13.5f, 16.05f, 13.5f, 15.5f)
                verticalLineTo(15.39f)
                lineTo(11.5f, 13.39f)
                verticalLineTo(15.5f)
                moveTo(16.42f, 18.31f)
                lineTo(14.73f, 16.62f)
                curveTo(14.32f, 17.43f, 13.5f, 18f, 12.5f, 18f)
                curveTo(11.12f, 18f, 10f, 16.88f, 10f, 15.5f)
                verticalLineTo(11.89f)
                lineTo(8.5f, 10.39f)
                verticalLineTo(17.5f)
                curveTo(8.5f, 19.71f, 10.29f, 21.5f, 12.5f, 21.5f)
                curveTo(14.43f, 21.5f, 16.04f, 20.13f, 16.42f, 18.31f)
                moveTo(10f, 6.8f)
                lineTo(11.5f, 8.3f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(6.8f)
                close()
            }
        }.build()

        return _PaperclipOff!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipOff: ImageVector? = null
