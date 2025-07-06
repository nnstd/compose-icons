package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotorbikeElectric: ImageVector
    get() {
        if (_MotorbikeElectric != null) {
            return _MotorbikeElectric!!
        }
        _MotorbikeElectric = ImageVector.Builder(
            name = "MotorbikeElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.42f, 8f)
                lineTo(13.41f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(12.59f)
                lineTo(14.59f, 8f)
                horizontalLineTo(6.5f)
                curveTo(4f, 8f, 2f, 10f, 2f, 12.5f)
                reflectiveCurveTo(4f, 17f, 6.5f, 17f)
                curveTo(8.72f, 17f, 10.56f, 15.38f, 10.92f, 13.27f)
                lineTo(13.04f, 12f)
                curveTo(13f, 12.17f, 13f, 12.33f, 13f, 12.5f)
                curveTo(13f, 15f, 15f, 17f, 17.5f, 17f)
                reflectiveCurveTo(22f, 15f, 22f, 12.5f)
                reflectiveCurveTo(20f, 8f, 17.5f, 8f)
                moveTo(8.84f, 13.26f)
                curveTo(8.5f, 14.27f, 7.58f, 15f, 6.47f, 15f)
                curveTo(5.09f, 15f, 3.97f, 13.88f, 3.97f, 12.5f)
                reflectiveCurveTo(5.09f, 10f, 6.47f, 10f)
                curveTo(7.59f, 10f, 8.5f, 10.74f, 8.84f, 11.75f)
                horizontalLineTo(6f)
                verticalLineTo(13.25f)
                lineTo(8.84f, 13.26f)
                moveTo(17.47f, 15f)
                curveTo(16.09f, 15f, 14.97f, 13.88f, 14.97f, 12.5f)
                reflectiveCurveTo(16.09f, 10f, 17.47f, 10f)
                curveTo(18.85f, 10f, 19.97f, 11.12f, 19.97f, 12.5f)
                reflectiveCurveTo(18.85f, 15f, 17.47f, 15f)
                moveTo(11f, 20f)
                horizontalLineTo(7f)
                lineTo(13f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                lineTo(11f, 18f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _MotorbikeElectric!!
    }

@Suppress("ObjectPropertyName")
private var _MotorbikeElectric: ImageVector? = null
