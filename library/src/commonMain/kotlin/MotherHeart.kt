package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotherHeart: ImageVector
    get() {
        if (_MotherHeart != null) {
            return _MotherHeart!!
        }
        _MotherHeart = ImageVector.Builder(
            name = "MotherHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(13.66f, 2f, 15f, 3.34f, 15f, 5f)
                reflectiveCurveTo(13.66f, 8f, 12f, 8f)
                reflectiveCurveTo(9f, 6.66f, 9f, 5f)
                reflectiveCurveTo(10.34f, 2f, 12f, 2f)
                moveTo(20f, 18f)
                lineTo(18f, 12.56f)
                curveTo(17.65f, 11.57f, 17.34f, 10.71f, 16f, 10f)
                curveTo(14.63f, 9.3f, 13.63f, 9f, 12f, 9f)
                curveTo(10.39f, 9f, 9.39f, 9.3f, 8f, 10f)
                curveTo(6.68f, 10.71f, 6.37f, 11.57f, 6f, 12.56f)
                lineTo(4f, 18f)
                curveTo(3.77f, 19.13f, 6.38f, 20.44f, 8.13f, 21.19f)
                curveTo(9.34f, 21.72f, 10.64f, 22f, 12f, 22f)
                curveTo(13.38f, 22f, 14.67f, 21.72f, 15.89f, 21.19f)
                curveTo(17.64f, 20.44f, 20.25f, 19.13f, 20f, 18f)
                moveTo(15.42f, 17.5f)
                lineTo(12f, 21f)
                lineTo(8.58f, 17.5f)
                curveTo(8.22f, 17.12f, 8f, 16.61f, 8f, 16.05f)
                curveTo(8f, 14.92f, 8.9f, 14f, 10f, 14f)
                curveTo(10.55f, 14f, 11.06f, 14.23f, 11.42f, 14.61f)
                lineTo(12f, 15.2f)
                lineTo(12.58f, 14.6f)
                curveTo(12.94f, 14.23f, 13.45f, 14f, 14f, 14f)
                curveTo(15.11f, 14f, 16f, 14.92f, 16f, 16.05f)
                curveTo(16f, 16.61f, 15.78f, 17.13f, 15.42f, 17.5f)
                close()
            }
        }.build()

        return _MotherHeart!!
    }

@Suppress("ObjectPropertyName")
private var _MotherHeart: ImageVector? = null
