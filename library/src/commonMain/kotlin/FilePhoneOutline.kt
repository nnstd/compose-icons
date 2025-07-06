package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePhoneOutline: ImageVector
    get() {
        if (_FilePhoneOutline != null) {
            return _FilePhoneOutline!!
        }
        _FilePhoneOutline = ImageVector.Builder(
            name = "FilePhoneOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(9f, 13.33f)
                curveTo(9.81f, 14.9f, 11.1f, 16.19f, 12.67f, 17f)
                lineTo(13.89f, 15.77f)
                curveTo(14.05f, 15.61f, 14.27f, 15.57f, 14.46f, 15.63f)
                curveTo(15.08f, 15.83f, 15.75f, 15.95f, 16.44f, 15.95f)
                curveTo(16.75f, 15.95f, 17f, 16.19f, 17f, 16.5f)
                verticalLineTo(18.45f)
                curveTo(17f, 18.75f, 16.75f, 19f, 16.44f, 19f)
                curveTo(11.23f, 19f, 7f, 14.77f, 7f, 9.56f)
                curveTo(7f, 9.25f, 7.25f, 9f, 7.56f, 9f)
                horizontalLineTo(9.5f)
                curveTo(9.81f, 9f, 10.06f, 9.25f, 10.06f, 9.56f)
                curveTo(10.06f, 10.25f, 10.17f, 10.92f, 10.37f, 11.54f)
                curveTo(10.43f, 11.73f, 10.39f, 11.95f, 10.23f, 12.11f)
                lineTo(9f, 13.33f)
                close()
            }
        }.build()

        return _FilePhoneOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilePhoneOutline: ImageVector? = null
