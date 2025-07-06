package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountInjuryOutline: ImageVector
    get() {
        if (_AccountInjuryOutline != null) {
            return _AccountInjuryOutline!!
        }
        _AccountInjuryOutline = ImageVector.Builder(
            name = "AccountInjuryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveTo(14.21f, 10f, 16f, 8.21f, 16f, 6f)
                reflectiveCurveTo(14.21f, 2f, 12f, 2f)
                reflectiveCurveTo(8f, 3.79f, 8f, 6f)
                reflectiveCurveTo(9.79f, 10f, 12f, 10f)
                moveTo(12f, 4f)
                curveTo(13.1f, 4f, 14f, 4.9f, 14f, 6f)
                reflectiveCurveTo(13.1f, 8f, 12f, 8f)
                reflectiveCurveTo(10f, 7.1f, 10f, 6f)
                reflectiveCurveTo(10.9f, 4f, 12f, 4f)
                moveTo(18.39f, 12.56f)
                curveTo(16.71f, 11.7f, 14.53f, 11f, 12f, 11f)
                reflectiveCurveTo(7.29f, 11.7f, 5.61f, 12.56f)
                curveTo(4.61f, 13.07f, 4f, 14.1f, 4f, 15.22f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(15.22f)
                curveTo(6f, 14.84f, 6.2f, 14.5f, 6.5f, 14.34f)
                curveTo(7.71f, 13.73f, 9.63f, 13f, 12f, 13f)
                curveTo(12.76f, 13f, 13.47f, 13.07f, 14.13f, 13.2f)
                lineTo(12.58f, 16.5f)
                horizontalLineTo(9.75f)
                curveTo(8.23f, 16.5f, 7f, 17.73f, 7f, 19.25f)
                reflectiveCurveTo(8.23f, 22f, 9.75f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(15.22f)
                curveTo(20f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f)
                moveTo(10.94f, 20f)
                horizontalLineTo(9.75f)
                curveTo(9.34f, 20f, 9f, 19.66f, 9f, 19.25f)
                reflectiveCurveTo(9.34f, 18.5f, 9.75f, 18.5f)
                horizontalLineTo(11.64f)
                lineTo(10.94f, 20f)
                moveTo(18f, 20f)
                horizontalLineTo(13.15f)
                lineTo(16.09f, 13.73f)
                curveTo(16.63f, 13.93f, 17.1f, 14.14f, 17.5f, 14.34f)
                curveTo(17.8f, 14.5f, 18f, 14.84f, 18f, 15.22f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _AccountInjuryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountInjuryOutline: ImageVector? = null
