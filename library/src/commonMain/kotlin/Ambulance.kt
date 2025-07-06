package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ambulance: ImageVector
    get() {
        if (_Ambulance != null) {
            return _Ambulance!!
        }
        _Ambulance = ImageVector.Builder(
            name = "Ambulance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(21.46f)
                lineTo(19.5f, 9.5f)
                moveTo(6f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18.5f)
                moveTo(20f, 8f)
                lineTo(23f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                horizontalLineTo(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(8f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Ambulance!!
    }

@Suppress("ObjectPropertyName")
private var _Ambulance: ImageVector? = null
