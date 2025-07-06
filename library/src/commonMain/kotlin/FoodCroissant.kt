package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodCroissant: ImageVector
    get() {
        if (_FoodCroissant != null) {
            return _FoodCroissant!!
        }
        _FoodCroissant = ImageVector.Builder(
            name = "FoodCroissant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19f)
                lineTo(19f, 17f)
                lineTo(22f, 15f)
                verticalLineTo(19f)
                moveTo(15f, 15f)
                lineTo(19f, 9f)
                lineTo(22f, 13f)
                lineTo(18f, 16f)
                lineTo(15f, 15f)
                moveTo(5f, 17f)
                lineTo(2f, 19f)
                verticalLineTo(15f)
                lineTo(5f, 17f)
                moveTo(9f, 15f)
                lineTo(6f, 16f)
                lineTo(2f, 13f)
                lineTo(5f, 9f)
                lineTo(9f, 15f)
                moveTo(14f, 6f)
                lineTo(18f, 8f)
                lineTo(13f, 15f)
                horizontalLineTo(11f)
                lineTo(6f, 8f)
                lineTo(10f, 6f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _FoodCroissant!!
    }

@Suppress("ObjectPropertyName")
private var _FoodCroissant: ImageVector? = null
