package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDecisionOutline: ImageVector
    get() {
        if (_ArrowDecisionOutline != null) {
            return _ArrowDecisionOutline!!
        }
        _ArrowDecisionOutline = ImageVector.Builder(
            name = "ArrowDecisionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.64f, 13.4f)
                curveTo(8.63f, 12.5f, 7.34f, 12.03f, 6f, 12f)
                verticalLineTo(15f)
                lineTo(2f, 11f)
                lineTo(6f, 7f)
                verticalLineTo(10f)
                curveTo(7.67f, 10f, 9.3f, 10.57f, 10.63f, 11.59f)
                curveTo(10.22f, 12.15f, 9.89f, 12.76f, 9.64f, 13.4f)
                moveTo(18f, 15f)
                verticalLineTo(12f)
                curveTo(17.5f, 12f, 13.5f, 12.16f, 13.05f, 16.2f)
                curveTo(14.61f, 16.75f, 15.43f, 18.47f, 14.88f, 20.03f)
                curveTo(14.33f, 21.59f, 12.61f, 22.41f, 11.05f, 21.86f)
                curveTo(9.5f, 21.3f, 8.67f, 19.59f, 9.22f, 18.03f)
                curveTo(9.5f, 17.17f, 10.2f, 16.5f, 11.05f, 16.2f)
                curveTo(11.34f, 12.61f, 14.4f, 9.88f, 18f, 10f)
                verticalLineTo(7f)
                lineTo(22f, 11f)
                lineTo(18f, 15f)
                moveTo(13f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19f)
                moveTo(11f, 11.12f)
                curveTo(11.58f, 10.46f, 12.25f, 9.89f, 13f, 9.43f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                lineTo(12f, 1f)
                lineTo(8f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(11.12f)
                close()
            }
        }.build()

        return _ArrowDecisionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDecisionOutline: ImageVector? = null
