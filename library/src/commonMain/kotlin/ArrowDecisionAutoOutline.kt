package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDecisionAutoOutline: ImageVector
    get() {
        if (_ArrowDecisionAutoOutline != null) {
            return _ArrowDecisionAutoOutline!!
        }
        _ArrowDecisionAutoOutline = ImageVector.Builder(
            name = "ArrowDecisionAutoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                verticalLineTo(12f)
                curveTo(18.5f, 12f, 14.5f, 12.16f, 14.05f, 16.2f)
                curveTo(15.61f, 16.75f, 16.43f, 18.47f, 15.88f, 20.03f)
                curveTo(15.33f, 21.59f, 13.61f, 22.41f, 12.05f, 21.86f)
                curveTo(10.5f, 21.3f, 9.67f, 19.59f, 10.22f, 18.03f)
                curveTo(10.5f, 17.17f, 11.2f, 16.5f, 12.05f, 16.2f)
                curveTo(12.34f, 12.61f, 15.4f, 9.88f, 19f, 10f)
                verticalLineTo(7f)
                lineTo(23f, 11f)
                lineTo(19f, 15f)
                moveTo(14f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                moveTo(12f, 11.12f)
                curveTo(12.58f, 10.46f, 13.25f, 9.89f, 14f, 9.43f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                lineTo(13f, 1f)
                lineTo(9f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(11.12f)
                moveTo(7.2f, 6f)
                horizontalLineTo(5.2f)
                lineTo(2f, 15f)
                horizontalLineTo(3.9f)
                lineTo(4.6f, 13f)
                horizontalLineTo(7.8f)
                lineTo(8.5f, 15f)
                horizontalLineTo(10.4f)
                lineTo(7.2f, 6f)
                moveTo(5.05f, 11.65f)
                lineTo(6.2f, 8f)
                lineTo(7.35f, 11.65f)
                horizontalLineTo(5.05f)
                close()
            }
        }.build()

        return _ArrowDecisionAutoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDecisionAutoOutline: ImageVector? = null
