package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MowerBag: ImageVector
    get() {
        if (_MowerBag != null) {
            return _MowerBag!!
        }
        _MowerBag = ImageVector.Builder(
            name = "MowerBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.95f, 14f)
                lineTo(10.82f, 12f)
                horizontalLineTo(14.76f)
                curveTo(15.5f, 12f, 16.21f, 12.43f, 16.55f, 13.11f)
                lineTo(17f, 14f)
                horizontalLineTo(11.95f)
                moveTo(23f, 18f)
                curveTo(23f, 19.66f, 21.66f, 21f, 20f, 21f)
                curveTo(18.7f, 21f, 17.6f, 20.16f, 17.18f, 19f)
                horizontalLineTo(11.65f)
                curveTo(11.09f, 20.18f, 9.89f, 21f, 8.5f, 21f)
                reflectiveCurveTo(5.91f, 20.18f, 5.35f, 19f)
                horizontalLineTo(2f)
                curveTo(1.45f, 19f, 1f, 18.55f, 1f, 18f)
                verticalLineTo(11f)
                curveTo(1f, 10.67f, 1.17f, 10.36f, 1.44f, 10.17f)
                curveTo(1.71f, 10f, 2.06f, 9.95f, 2.37f, 10.07f)
                lineTo(7.43f, 12.09f)
                lineTo(3.42f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                horizontalLineTo(4.58f)
                lineTo(11.37f, 15f)
                horizontalLineTo(20f)
                curveTo(21.66f, 15f, 23f, 16.34f, 23f, 18f)
                moveTo(7.34f, 14.21f)
                lineTo(3f, 12.5f)
                verticalLineTo(17f)
                horizontalLineTo(5.05f)
                curveTo(5.24f, 15.7f, 6.13f, 14.64f, 7.34f, 14.21f)
                moveTo(10f, 17.5f)
                curveTo(10f, 16.67f, 9.33f, 16f, 8.5f, 16f)
                reflectiveCurveTo(7f, 16.67f, 7f, 17.5f)
                reflectiveCurveTo(7.67f, 19f, 8.5f, 19f)
                reflectiveCurveTo(10f, 18.33f, 10f, 17.5f)
                moveTo(21f, 18f)
                curveTo(21f, 17.45f, 20.55f, 17f, 20f, 17f)
                reflectiveCurveTo(19f, 17.45f, 19f, 18f)
                reflectiveCurveTo(19.45f, 19f, 20f, 19f)
                reflectiveCurveTo(21f, 18.55f, 21f, 18f)
                close()
            }
        }.build()

        return _MowerBag!!
    }

@Suppress("ObjectPropertyName")
private var _MowerBag: ImageVector? = null
