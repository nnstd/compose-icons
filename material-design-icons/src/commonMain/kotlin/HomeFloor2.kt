package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFloor2: ImageVector
    get() {
        if (_HomeFloor2 != null) {
            return _HomeFloor2!!
        }
        _HomeFloor2 = ImageVector.Builder(
            name = "HomeFloor2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                lineTo(12f, 3f)
                moveTo(9f, 8f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 10f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _HomeFloor2!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFloor2: ImageVector? = null
