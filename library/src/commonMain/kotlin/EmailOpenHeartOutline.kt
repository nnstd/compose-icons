package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOpenHeartOutline: ImageVector
    get() {
        if (_EmailOpenHeartOutline != null) {
            return _EmailOpenHeartOutline!!
        }
        _EmailOpenHeartOutline = ImageVector.Builder(
            name = "EmailOpenHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9f)
                curveTo(8.9f, 9f, 8f, 9.92f, 8f, 11.05f)
                curveTo(8f, 11.62f, 8.22f, 12.12f, 8.59f, 12.5f)
                lineTo(12f, 16f)
                lineTo(15.42f, 12.5f)
                curveTo(15.78f, 12.13f, 16f, 11.61f, 16f, 11.05f)
                curveTo(16f, 9.92f, 15.1f, 9f, 14f, 9f)
                curveTo(13.46f, 9f, 12.95f, 9.23f, 12.59f, 9.6f)
                lineTo(12f, 10.2f)
                lineTo(11.42f, 9.61f)
                curveTo(11.05f, 9.23f, 10.54f, 9f, 10f, 9f)
                moveTo(12f, 0.64f)
                lineTo(21.03f, 6.29f)
                curveTo(21.61f, 6.64f, 22f, 7.27f, 22f, 8f)
                verticalLineTo(18f)
                curveTo(22f, 19.1f, 21.1f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(8f)
                curveTo(2f, 7.27f, 2.39f, 6.64f, 2.97f, 6.29f)
                lineTo(12f, 0.64f)
                moveTo(4f, 10f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                lineTo(18f, 11.25f)
                curveTo(18f, 11.19f, 18f, 11.12f, 18f, 11.05f)
                curveTo(18f, 10.5f, 17.88f, 9.95f, 17.67f, 9.45f)
                lineTo(20f, 8f)
                lineTo(12f, 3f)
                lineTo(4f, 8f)
                lineTo(6.33f, 9.45f)
                curveTo(6.12f, 9.95f, 6f, 10.5f, 6f, 11.05f)
                curveTo(6f, 11.12f, 6f, 11.19f, 6f, 11.25f)
                lineTo(4f, 10f)
                close()
            }
        }.build()

        return _EmailOpenHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOpenHeartOutline: ImageVector? = null
