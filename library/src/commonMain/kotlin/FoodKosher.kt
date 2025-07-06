package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodKosher: ImageVector
    get() {
        if (_FoodKosher != null) {
            return _FoodKosher!!
        }
        _FoodKosher = ImageVector.Builder(
            name = "FoodKosher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                curveTo(3.57f, 9f, 4f, 9.43f, 4f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                curveTo(6f, 8.36f, 4.64f, 7f, 3f, 7f)
                horizontalLineTo(1f)
                moveTo(7f, 7f)
                verticalLineTo(14f)
                curveTo(7f, 15.65f, 8.36f, 17f, 10f, 17f)
                horizontalLineTo(14f)
                curveTo(15.65f, 17f, 17f, 15.65f, 17f, 14f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                curveTo(15f, 14.57f, 14.57f, 15f, 14f, 15f)
                horizontalLineTo(10f)
                curveTo(9.43f, 15f, 9f, 14.57f, 9f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                curveTo(11.65f, 13f, 13f, 11.65f, 13f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                curveTo(11f, 10.57f, 10.57f, 11f, 10f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                curveTo(20.57f, 9f, 21f, 9.43f, 21f, 10f)
                verticalLineTo(14f)
                curveTo(21f, 14.57f, 20.57f, 15f, 20f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                curveTo(21.65f, 17f, 23f, 15.65f, 23f, 14f)
                verticalLineTo(10f)
                curveTo(23f, 8.36f, 21.65f, 7f, 20f, 7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FoodKosher!!
    }

@Suppress("ObjectPropertyName")
private var _FoodKosher: ImageVector? = null
