package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartSettingsOutline: ImageVector
    get() {
        if (_HeartSettingsOutline != null) {
            return _HeartSettingsOutline!!
        }
        _HeartSettingsOutline = ImageVector.Builder(
            name = "HeartSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                moveTo(22f, 8.5f)
                curveTo(22f, 12.27f, 18.6f, 15.36f, 13.45f, 20.03f)
                lineTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 5.41f, 4.42f, 3f, 7.5f, 3f)
                curveTo(9.24f, 3f, 10.91f, 3.81f, 12f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3f, 16.5f, 3f)
                curveTo(19.58f, 3f, 22f, 5.41f, 22f, 8.5f)
                moveTo(20f, 8.5f)
                curveTo(20f, 6.5f, 18.5f, 5f, 16.5f, 5f)
                curveTo(14.96f, 5f, 13.46f, 6f, 12.93f, 7.36f)
                horizontalLineTo(11.07f)
                curveTo(10.54f, 6f, 9.04f, 5f, 7.5f, 5f)
                curveTo(5.5f, 5f, 4f, 6.5f, 4f, 8.5f)
                curveTo(4f, 11.39f, 7.14f, 14.24f, 11.89f, 18.55f)
                lineTo(12f, 18.65f)
                lineTo(12.1f, 18.55f)
                curveTo(16.86f, 14.24f, 20f, 11.39f, 20f, 8.5f)
                close()
            }
        }.build()

        return _HeartSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSettingsOutline: ImageVector? = null
