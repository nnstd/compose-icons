package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PeanutOff: ImageVector
    get() {
        if (_PeanutOff != null) {
            return _PeanutOff!!
        }
        _PeanutOff = ImageVector.Builder(
            name = "PeanutOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.9f, 10.12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.08f, 2.12f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.68f, 4.5f)
                lineTo(16.38f, 13.18f)
                arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.04f, 12.77f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.9f, 10.12f)
                moveTo(13f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                moveTo(7f, 6.39f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(7.8f, 9.69f)
                curveTo(7.9f, 9.84f, 8f, 10f, 8.11f, 10.12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12.72f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.81f, 21.87f)
                arcTo(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 18.86f)
                lineTo(20.87f, 22.73f)
                lineTo(22.14f, 21.46f)
                moveTo(11f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18f)
                moveTo(14f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 19f)
                moveTo(13f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.35f, 14.24f)
                lineTo(13.76f, 15.65f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 16f)
                close()
            }
        }.build()

        return _PeanutOff!!
    }

@Suppress("ObjectPropertyName")
private var _PeanutOff: ImageVector? = null
