package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MotherNurse: ImageVector
    get() {
        if (_MotherNurse != null) {
            return _MotherNurse!!
        }
        _MotherNurse = ImageVector.Builder(
            name = "MotherNurse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(20f, 18f)
                lineTo(18f, 12.56f)
                curveTo(17.65f, 11.57f, 17.34f, 10.71f, 16f, 10f)
                curveTo(14.62f, 9.3f, 13.62f, 9f, 12f, 9f)
                curveTo(10.37f, 9f, 9.38f, 9.3f, 8f, 10f)
                curveTo(6.66f, 10.71f, 6.35f, 11.57f, 6f, 12.56f)
                lineTo(4f, 18f)
                curveTo(3.68f, 19.35f, 6.36f, 20.44f, 8.11f, 21.19f)
                verticalLineTo(19f)
                curveTo(8.11f, 18.05f, 8.97f, 17.38f, 10.69f, 16.97f)
                curveTo(10.85f, 16.93f, 11f, 16.91f, 11.12f, 16.89f)
                curveTo(10.58f, 16.07f, 10.36f, 15.34f, 10.34f, 15.28f)
                lineTo(12.11f, 14.68f)
                curveTo(12.12f, 14.7f, 12.63f, 16.27f, 13.84f, 17.06f)
                curveTo(14.05f, 17.13f, 14.26f, 17.21f, 14.46f, 17.3f)
                curveTo(15.23f, 17.64f, 15.69f, 18.08f, 15.84f, 18.61f)
                curveTo(14.5f, 19.14f, 13.22f, 19.41f, 12f, 19.41f)
                lineTo(11f, 19.31f)
                verticalLineTo(21.94f)
                lineTo(12f, 22f)
                curveTo(13.37f, 22f, 14.67f, 21.72f, 15.89f, 21.19f)
                curveTo(17.64f, 20.44f, 20.25f, 19.13f, 20f, 18f)
                moveTo(15.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 17f)
                close()
            }
        }.build()

        return _MotherNurse!!
    }

@Suppress("ObjectPropertyName")
private var _MotherNurse: ImageVector? = null
