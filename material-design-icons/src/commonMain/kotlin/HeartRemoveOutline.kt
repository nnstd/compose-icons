package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartRemoveOutline: ImageVector
    get() {
        if (_HeartRemoveOutline != null) {
            return _HeartRemoveOutline!!
        }
        _HeartRemoveOutline = ImageVector.Builder(
            name = "HeartRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.67f, 20.74f)
                lineTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 5.41f, 4.42f, 3f, 7.5f, 3f)
                curveTo(9.24f, 3f, 10.91f, 3.81f, 12f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3f, 16.5f, 3f)
                curveTo(19.58f, 3f, 22f, 5.41f, 22f, 8.5f)
                curveTo(22f, 9.93f, 21.5f, 11.26f, 20.62f, 12.61f)
                curveTo(20f, 12.31f, 19.31f, 12.11f, 18.59f, 12.04f)
                curveTo(19.5f, 10.8f, 20f, 9.65f, 20f, 8.5f)
                curveTo(20f, 6.5f, 18.5f, 5f, 16.5f, 5f)
                curveTo(14.96f, 5f, 13.46f, 6f, 12.93f, 7.36f)
                horizontalLineTo(11.07f)
                curveTo(10.54f, 6f, 9.04f, 5f, 7.5f, 5f)
                curveTo(5.5f, 5f, 4f, 6.5f, 4f, 8.5f)
                curveTo(4f, 11.39f, 7.14f, 14.24f, 11.89f, 18.55f)
                lineTo(12f, 18.65f)
                lineTo(12.04f, 18.61f)
                curveTo(12.12f, 19.37f, 12.34f, 20.09f, 12.67f, 20.74f)
                moveTo(20.12f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(15.88f, 14.47f)
                lineTo(14.47f, 15.88f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 20.12f)
                lineTo(15.88f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(20.12f, 21.54f)
                lineTo(21.54f, 20.12f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 15.88f)
                lineTo(20.12f, 14.46f)
                close()
            }
        }.build()

        return _HeartRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeartRemoveOutline: ImageVector? = null
