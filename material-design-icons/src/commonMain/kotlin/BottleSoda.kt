package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleSoda: ImageVector
    get() {
        if (_BottleSoda != null) {
            return _BottleSoda!!
        }
        _BottleSoda = ImageVector.Builder(
            name = "BottleSoda",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 22f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 9.58f)
                curveTo(11.1f, 7.89f, 11f, 4f, 11f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                reflectiveCurveTo(12.9f, 7.89f, 14.4f, 9.58f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11f)
                close()
            }
        }.build()

        return _BottleSoda!!
    }

@Suppress("ObjectPropertyName")
private var _BottleSoda: ImageVector? = null
