package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CableData: ImageVector
    get() {
        if (_CableData != null) {
            return _CableData!!
        }
        _CableData = ImageVector.Builder(
            name = "CableData",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.05f, 3.5f)
                curveTo(5.68f, 4.88f, 5.68f, 7.1f, 7.05f, 8.47f)
                lineTo(15.54f, 16.95f)
                curveTo(16.12f, 17.54f, 16.12f, 18.5f, 15.54f, 19.07f)
                curveTo(14.95f, 19.66f, 14f, 19.66f, 13.41f, 19.07f)
                lineTo(9.17f, 14.83f)
                lineTo(10.23f, 13.77f)
                lineTo(6.7f, 10.23f)
                lineTo(6.34f, 10.59f)
                lineTo(4.93f, 9.17f)
                curveTo(4.54f, 8.78f, 3.91f, 8.78f, 3.5f, 9.17f)
                lineTo(2.1f, 10.59f)
                curveTo(1.71f, 11f, 1.71f, 11.61f, 2.1f, 12f)
                lineTo(3.5f, 13.41f)
                lineTo(3.16f, 13.77f)
                lineTo(6.7f, 17.3f)
                lineTo(7.76f, 16.24f)
                lineTo(12f, 20.5f)
                curveTo(13.37f, 21.85f, 15.58f, 21.85f, 16.95f, 20.5f)
                curveTo(18.32f, 19.12f, 18.32f, 16.9f, 16.95f, 15.54f)
                lineTo(8.46f, 7.05f)
                curveTo(7.88f, 6.46f, 7.88f, 5.5f, 8.46f, 4.93f)
                curveTo(9.05f, 4.34f, 10f, 4.34f, 10.59f, 4.93f)
                lineTo(14.83f, 9.17f)
                lineTo(13.77f, 10.23f)
                lineTo(17.3f, 13.77f)
                lineTo(17.66f, 13.41f)
                lineTo(19.07f, 14.83f)
                curveTo(19.46f, 15.22f, 20.1f, 15.22f, 20.5f, 14.83f)
                lineTo(21.9f, 13.41f)
                curveTo(22.29f, 13f, 22.29f, 12.39f, 21.9f, 12f)
                lineTo(20.5f, 10.59f)
                lineTo(20.84f, 10.23f)
                lineTo(17.3f, 6.7f)
                lineTo(16.24f, 7.76f)
                lineTo(12f, 3.5f)
                curveTo(10.63f, 2.15f, 8.42f, 2.15f, 7.05f, 3.5f)
                moveTo(2.81f, 11.29f)
                lineTo(4.22f, 9.88f)
                lineTo(5.64f, 11.29f)
                lineTo(4.22f, 12.71f)
                moveTo(18.36f, 12.71f)
                lineTo(19.78f, 11.29f)
                lineTo(21.19f, 12.71f)
                lineTo(19.78f, 14.12f)
                close()
            }
        }.build()

        return _CableData!!
    }

@Suppress("ObjectPropertyName")
private var _CableData: ImageVector? = null
