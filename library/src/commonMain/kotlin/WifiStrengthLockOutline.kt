package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrengthLockOutline: ImageVector
    get() {
        if (_WifiStrengthLockOutline != null) {
            return _WifiStrengthLockOutline!!
        }
        _WifiStrengthLockOutline = ImageVector.Builder(
            name = "WifiStrengthLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.65f, 7f)
                horizontalLineTo(23.64f)
                lineTo(20.91f, 10.39f)
                curveTo(20.32f, 10.14f, 19.68f, 10f, 19f, 10f)
                curveTo(18.87f, 10f, 18.75f, 10.03f, 18.63f, 10.04f)
                lineTo(20.71f, 7.45f)
                curveTo(18.09f, 5.86f, 15.07f, 5f, 12f, 5f)
                curveTo(8.91f, 5f, 5.9f, 5.85f, 3.27f, 7.44f)
                lineTo(12f, 18.3f)
                lineTo(13f, 17f)
                curveTo(13f, 17.08f, 13f, 17.14f, 13f, 17.2f)
                verticalLineTo(20.25f)
                lineTo(12f, 21.5f)
                curveTo(8.13f, 16.66f, 4.24f, 11.83f, 0.355f, 7f)
                horizontalLineTo(0.375f)
                curveTo(3.7f, 4.41f, 7.79f, 3f, 12f, 3f)
                curveTo(16.22f, 3f, 20.32f, 4.41f, 23.65f, 7f)
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12f, 19f, 12f)
                reflectiveCurveTo(21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _WifiStrengthLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrengthLockOutline: ImageVector? = null
