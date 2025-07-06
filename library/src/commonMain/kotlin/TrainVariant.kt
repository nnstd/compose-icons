package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainVariant: ImageVector
    get() {
        if (_TrainVariant != null) {
            return _TrainVariant!!
        }
        _TrainVariant = ImageVector.Builder(
            name = "TrainVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                moveTo(12f, 17f)
                curveTo(10.89f, 17f, 10f, 16.1f, 10f, 15f)
                curveTo(10f, 13.89f, 10.89f, 13f, 12f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                moveTo(4f, 15.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 19f)
                lineTo(6f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(20.5f)
                lineTo(16.5f, 19f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                verticalLineTo(5f)
                curveTo(20f, 1.5f, 16.42f, 1f, 12f, 1f)
                curveTo(7.58f, 1f, 4f, 1.5f, 4f, 5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _TrainVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TrainVariant: ImageVector? = null
