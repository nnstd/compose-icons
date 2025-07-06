package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiameterOutline: ImageVector
    get() {
        if (_DiameterOutline != null) {
            return _DiameterOutline!!
        }
        _DiameterOutline = ImageVector.Builder(
            name = "DiameterOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(16f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                lineTo(5f, 12f)
                lineTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                lineTo(19f, 12f)
                lineTo(16f, 15f)
                close()
            }
        }.build()

        return _DiameterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DiameterOutline: ImageVector? = null
