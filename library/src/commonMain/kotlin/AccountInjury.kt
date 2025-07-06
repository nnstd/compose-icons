package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountInjury: ImageVector
    get() {
        if (_AccountInjury != null) {
            return _AccountInjury!!
        }
        _AccountInjury = ImageVector.Builder(
            name = "AccountInjury",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6f)
                curveTo(8f, 3.79f, 9.79f, 2f, 12f, 2f)
                reflectiveCurveTo(16f, 3.79f, 16f, 6f)
                reflectiveCurveTo(14.21f, 10f, 12f, 10f)
                reflectiveCurveTo(8f, 8.21f, 8f, 6f)
                moveTo(17f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(15.22f)
                curveTo(20f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f)
                curveTo(17.96f, 12.34f, 17.5f, 12.13f, 17f, 11.94f)
                verticalLineTo(22f)
                moveTo(12.34f, 17f)
                lineTo(15f, 11.33f)
                curveTo(14.07f, 11.12f, 13.07f, 11f, 12f, 11f)
                curveTo(9.47f, 11f, 7.29f, 11.7f, 5.61f, 12.56f)
                curveTo(4.61f, 13.07f, 4f, 14.1f, 4f, 15.22f)
                verticalLineTo(22f)
                horizontalLineTo(6.34f)
                curveTo(6.12f, 21.55f, 6f, 21.04f, 6f, 20.5f)
                curveTo(6f, 18.57f, 7.57f, 17f, 9.5f, 17f)
                horizontalLineTo(12.34f)
                moveTo(10f, 22f)
                lineTo(11.41f, 19f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 19f, 8f, 19.67f, 8f, 20.5f)
                reflectiveCurveTo(8.67f, 22f, 9.5f, 22f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _AccountInjury!!
    }

@Suppress("ObjectPropertyName")
private var _AccountInjury: ImageVector? = null
