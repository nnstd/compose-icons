package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeModern: ImageVector
    get() {
        if (_HomeModern != null) {
            return _HomeModern!!
        }
        _HomeModern = ImageVector.Builder(
            name = "HomeModern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 21f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                lineTo(16f, 3f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                moveTo(14f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                moveTo(8f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                moveTo(12f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _HomeModern!!
    }

@Suppress("ObjectPropertyName")
private var _HomeModern: ImageVector? = null
