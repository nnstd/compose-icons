package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabeticalOff: ImageVector
    get() {
        if (_AlphabeticalOff != null) {
            return _AlphabeticalOff!!
        }
        _AlphabeticalOff = ImageVector.Builder(
            name = "AlphabeticalOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(16f, 15.31f)
                lineTo(14f, 13.31f)
                lineTo(13.65f, 13f)
                lineTo(10f, 9.34f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(10f, 11.89f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                horizontalLineTo(14f)
                arcTo(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.89f, 16.78f)
                lineTo(20.84f, 22.73f)
                moveTo(12f, 15f)
                verticalLineTo(13.89f)
                lineTo(13.11f, 15f)
                moveTo(16f, 12.78f)
                lineTo(14.22f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12.78f)
                moveTo(20.2f, 17f)
                lineTo(18f, 14.8f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 13f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 11f)
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(12f, 8.8f)
                lineTo(10.2f, 7f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _AlphabeticalOff!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabeticalOff: ImageVector? = null
