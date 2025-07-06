package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountStar: ImageVector
    get() {
        if (_AccountStar != null) {
            return _AccountStar!!
        }
        _AccountStar = ImageVector.Builder(
            name = "AccountStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                curveTo(12.33f, 14f, 7f, 15.33f, 7f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                curveTo(23f, 15.33f, 17.67f, 14f, 15f, 14f)
                moveTo(15f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                moveTo(5f, 13.28f)
                lineTo(7.45f, 14.77f)
                lineTo(6.8f, 11.96f)
                lineTo(9f, 10.08f)
                lineTo(6.11f, 9.83f)
                lineTo(5f, 7.19f)
                lineTo(3.87f, 9.83f)
                lineTo(1f, 10.08f)
                lineTo(3.18f, 11.96f)
                lineTo(2.5f, 14.77f)
                lineTo(5f, 13.28f)
                close()
            }
        }.build()

        return _AccountStar!!
    }

@Suppress("ObjectPropertyName")
private var _AccountStar: ImageVector? = null
