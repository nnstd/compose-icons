package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFloor0: ImageVector
    get() {
        if (_HomeFloor0 != null) {
            return _HomeFloor0!!
        }
        _HomeFloor0 = ImageVector.Builder(
            name = "HomeFloor0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                moveTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                moveTo(15f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _HomeFloor0!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFloor0: ImageVector? = null
