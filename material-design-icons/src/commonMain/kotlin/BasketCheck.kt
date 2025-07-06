package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketCheck: ImageVector
    get() {
        if (_BasketCheck != null) {
            return _BasketCheck!!
        }
        _BasketCheck = ImageVector.Builder(
            name = "BasketCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.63f, 16.27f)
                lineTo(17.76f, 20.17f)
                lineTo(16.41f, 18.8f)
                lineTo(15f, 20.22f)
                lineTo(17.75f, 23f)
                lineTo(23.03f, 17.68f)
                lineTo(21.63f, 16.27f)
                moveTo(13f, 20f)
                curveTo(13f, 16.69f, 15.69f, 14f, 19f, 14f)
                curveTo(20f, 14f, 20.92f, 14.24f, 21.74f, 14.67f)
                lineTo(22.96f, 10.29f)
                lineTo(23f, 10f)
                curveTo(23f, 9.45f, 22.55f, 9f, 22f, 9f)
                horizontalLineTo(17.42f)
                lineTo(12.83f, 2.44f)
                curveTo(12.65f, 2.17f, 12.34f, 2f, 12f, 2f)
                reflectiveCurveTo(11.36f, 2.17f, 11.18f, 2.43f)
                lineTo(6.58f, 9f)
                horizontalLineTo(2f)
                curveTo(1.45f, 9f, 1f, 9.45f, 1f, 10f)
                lineTo(1.1f, 10.44f)
                lineTo(3.71f, 19.9f)
                curveTo(4.04f, 20.55f, 4.72f, 21f, 5.5f, 21f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 20.67f, 13f, 20.34f, 13f, 20f)
                moveTo(12f, 4.74f)
                lineTo(15f, 9f)
                horizontalLineTo(9f)
                lineTo(12f, 4.74f)
                moveTo(10f, 15f)
                curveTo(10f, 13.9f, 10.9f, 13f, 12f, 13f)
                reflectiveCurveTo(14f, 13.9f, 14f, 15f)
                reflectiveCurveTo(13.11f, 17f, 12f, 17f)
                reflectiveCurveTo(10f, 16.11f, 10f, 15f)
                close()
            }
        }.build()

        return _BasketCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BasketCheck: ImageVector? = null
