package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SyncCircle: ImageVector
    get() {
        if (_SyncCircle != null) {
            return _SyncCircle!!
        }
        _SyncCircle = ImageVector.Builder(
            name = "SyncCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                moveTo(15.6f, 13.72f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                verticalLineTo(10f)
                lineTo(8.88f, 7f)
                lineTo(12f, 4f)
                verticalLineTo(6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.07f, 15.19f)
                moveTo(6f, 12f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.93f, 8.81f)
                lineTo(8.4f, 10.28f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                verticalLineTo(14f)
                lineTo(15f, 17f)
                lineTo(12f, 20f)
                verticalLineTo(18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                close()
            }
        }.build()

        return _SyncCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SyncCircle: ImageVector? = null
