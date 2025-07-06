package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cash100: ImageVector
    get() {
        if (_Cash100 != null) {
            return _Cash100!!
        }
        _Cash100 = ImageVector.Builder(
            name = "Cash100",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                moveTo(20f, 18f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                moveTo(17f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 17f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8f)
                horizontalLineTo(17f)
                moveTo(17f, 13f)
                verticalLineTo(12f)
                curveTo(17f, 10.9f, 16.33f, 10f, 15.5f, 10f)
                curveTo(14.67f, 10f, 14f, 10.9f, 14f, 12f)
                verticalLineTo(13f)
                curveTo(14f, 14.1f, 14.67f, 15f, 15.5f, 15f)
                curveTo(16.33f, 15f, 17f, 14.1f, 17f, 13f)
                moveTo(15.5f, 11f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 14f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 13.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 11f)
                moveTo(13f, 13f)
                verticalLineTo(12f)
                curveTo(13f, 10.9f, 12.33f, 10f, 11.5f, 10f)
                curveTo(10.67f, 10f, 10f, 10.9f, 10f, 12f)
                verticalLineTo(13f)
                curveTo(10f, 14.1f, 10.67f, 15f, 11.5f, 15f)
                curveTo(12.33f, 15f, 13f, 14.1f, 13f, 13f)
                moveTo(11.5f, 11f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 14f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 13.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 11f)
                moveTo(8f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                lineTo(7f, 10.5f)
                verticalLineTo(11.5f)
                lineTo(8f, 11f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Cash100!!
    }

@Suppress("ObjectPropertyName")
private var _Cash100: ImageVector? = null
