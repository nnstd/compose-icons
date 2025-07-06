package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarEmergency: ImageVector
    get() {
        if (_CarEmergency != null) {
            return _CarEmergency!!
        }
        _CarEmergency = ImageVector.Builder(
            name = "CarEmergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                moveTo(7.88f, 1.46f)
                lineTo(6.46f, 2.87f)
                lineTo(8.59f, 5f)
                lineTo(10f, 3.58f)
                lineTo(7.88f, 1.46f)
                moveTo(16.12f, 1.46f)
                lineTo(14f, 3.58f)
                lineTo(15.41f, 5f)
                lineTo(17.54f, 2.88f)
                lineTo(16.12f, 1.46f)
                moveTo(12f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 8f, 5.28f, 8.42f, 5.08f, 9f)
                lineTo(3f, 15f)
                verticalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 24f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 23f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 24f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 23f)
                verticalLineTo(15f)
                lineTo(18.92f, 9f)
                curveTo(18.72f, 8.42f, 18.16f, 8f, 17.5f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(6.5f, 9.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 14f)
                horizontalLineTo(5f)
                lineTo(6.5f, 9.5f)
                moveTo(6.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 16f)
                moveTo(17.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 16f)
                close()
            }
        }.build()

        return _CarEmergency!!
    }

@Suppress("ObjectPropertyName")
private var _CarEmergency: ImageVector? = null
