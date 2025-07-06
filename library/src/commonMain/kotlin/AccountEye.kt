package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountEye: ImageVector
    get() {
        if (_AccountEye != null) {
            return _AccountEye!!
        }
        _AccountEye = ImageVector.Builder(
            name = "AccountEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 8f)
                curveTo(6f, 5.79f, 7.79f, 4f, 10f, 4f)
                reflectiveCurveTo(14f, 5.79f, 14f, 8f)
                reflectiveCurveTo(12.21f, 12f, 10f, 12f)
                reflectiveCurveTo(6f, 10.21f, 6f, 8f)
                moveTo(9.14f, 19.75f)
                lineTo(8.85f, 19f)
                lineTo(9.14f, 18.25f)
                curveTo(9.84f, 16.5f, 11.08f, 15.14f, 12.61f, 14.22f)
                curveTo(11.79f, 14.08f, 10.92f, 14f, 10f, 14f)
                curveTo(5.58f, 14f, 2f, 15.79f, 2f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(9.27f)
                curveTo(9.23f, 19.91f, 9.18f, 19.83f, 9.14f, 19.75f)
                moveTo(17f, 18f)
                curveTo(16.44f, 18f, 16f, 18.44f, 16f, 19f)
                reflectiveCurveTo(16.44f, 20f, 17f, 20f)
                reflectiveCurveTo(18f, 19.56f, 18f, 19f)
                reflectiveCurveTo(17.56f, 18f, 17f, 18f)
                moveTo(23f, 19f)
                curveTo(22.06f, 21.34f, 19.73f, 23f, 17f, 23f)
                reflectiveCurveTo(11.94f, 21.34f, 11f, 19f)
                curveTo(11.94f, 16.66f, 14.27f, 15f, 17f, 15f)
                reflectiveCurveTo(22.06f, 16.66f, 23f, 19f)
                moveTo(19.5f, 19f)
                curveTo(19.5f, 17.62f, 18.38f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(14.5f, 17.62f, 14.5f, 19f)
                reflectiveCurveTo(15.62f, 21.5f, 17f, 21.5f)
                reflectiveCurveTo(19.5f, 20.38f, 19.5f, 19f)
                close()
            }
        }.build()

        return _AccountEye!!
    }

@Suppress("ObjectPropertyName")
private var _AccountEye: ImageVector? = null
