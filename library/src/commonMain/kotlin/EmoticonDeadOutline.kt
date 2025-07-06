package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonDeadOutline: ImageVector
    get() {
        if (_EmoticonDeadOutline != null) {
            return _EmoticonDeadOutline!!
        }
        _EmoticonDeadOutline = ImageVector.Builder(
            name = "EmoticonDeadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                curveTo(2f, 17.53f, 6.47f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 6.47f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(16.18f, 7.76f)
                lineTo(15.12f, 8.82f)
                lineTo(14.06f, 7.76f)
                lineTo(13f, 8.82f)
                lineTo(14.06f, 9.88f)
                lineTo(13f, 10.94f)
                lineTo(14.06f, 12f)
                lineTo(15.12f, 10.94f)
                lineTo(16.18f, 12f)
                lineTo(17.24f, 10.94f)
                lineTo(16.18f, 9.88f)
                lineTo(17.24f, 8.82f)
                lineTo(16.18f, 7.76f)
                moveTo(7.82f, 12f)
                lineTo(8.88f, 10.94f)
                lineTo(9.94f, 12f)
                lineTo(11f, 10.94f)
                lineTo(9.94f, 9.88f)
                lineTo(11f, 8.82f)
                lineTo(9.94f, 7.76f)
                lineTo(8.88f, 8.82f)
                lineTo(7.82f, 7.76f)
                lineTo(6.76f, 8.82f)
                lineTo(7.82f, 9.88f)
                lineTo(6.76f, 10.94f)
                lineTo(7.82f, 12f)
                moveTo(12f, 14f)
                curveTo(9.67f, 14f, 7.69f, 15.46f, 6.89f, 17.5f)
                horizontalLineTo(17.11f)
                curveTo(16.31f, 15.46f, 14.33f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _EmoticonDeadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonDeadOutline: ImageVector? = null
