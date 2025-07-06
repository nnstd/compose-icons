package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountEyeOutline: ImageVector
    get() {
        if (_AccountEyeOutline != null) {
            return _AccountEyeOutline!!
        }
        _AccountEyeOutline = ImageVector.Builder(
            name = "AccountEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                curveTo(12.21f, 12f, 14f, 10.21f, 14f, 8f)
                reflectiveCurveTo(12.21f, 4f, 10f, 4f)
                reflectiveCurveTo(6f, 5.79f, 6f, 8f)
                reflectiveCurveTo(7.79f, 12f, 10f, 12f)
                moveTo(10f, 6f)
                curveTo(11.11f, 6f, 12f, 6.9f, 12f, 8f)
                reflectiveCurveTo(11.11f, 10f, 10f, 10f)
                reflectiveCurveTo(8f, 9.11f, 8f, 8f)
                reflectiveCurveTo(8.9f, 6f, 10f, 6f)
                moveTo(9.27f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 14.33f, 7.33f, 13f, 10f, 13f)
                curveTo(11.04f, 13f, 12.5f, 13.21f, 13.86f, 13.61f)
                curveTo(13f, 13.95f, 12.2f, 14.42f, 11.5f, 15f)
                curveTo(11f, 14.94f, 10.5f, 14.9f, 10f, 14.9f)
                curveTo(7.03f, 14.9f, 3.9f, 16.36f, 3.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(9.22f)
                curveTo(9.2f, 18.15f, 9.17f, 18.2f, 9.14f, 18.25f)
                lineTo(8.85f, 19f)
                lineTo(9.14f, 19.75f)
                curveTo(9.18f, 19.83f, 9.23f, 19.91f, 9.27f, 20f)
                moveTo(17f, 18f)
                curveTo(17.56f, 18f, 18f, 18.44f, 18f, 19f)
                reflectiveCurveTo(17.56f, 20f, 17f, 20f)
                reflectiveCurveTo(16f, 19.56f, 16f, 19f)
                reflectiveCurveTo(16.44f, 18f, 17f, 18f)
                moveTo(17f, 15f)
                curveTo(14.27f, 15f, 11.94f, 16.66f, 11f, 19f)
                curveTo(11.94f, 21.34f, 14.27f, 23f, 17f, 23f)
                reflectiveCurveTo(22.06f, 21.34f, 23f, 19f)
                curveTo(22.06f, 16.66f, 19.73f, 15f, 17f, 15f)
                moveTo(17f, 21.5f)
                curveTo(15.62f, 21.5f, 14.5f, 20.38f, 14.5f, 19f)
                reflectiveCurveTo(15.62f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(19.5f, 17.62f, 19.5f, 19f)
                reflectiveCurveTo(18.38f, 21.5f, 17f, 21.5f)
                close()
            }
        }.build()

        return _AccountEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountEyeOutline: ImageVector? = null
