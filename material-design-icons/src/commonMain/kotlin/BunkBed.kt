package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BunkBed: ImageVector
    get() {
        if (_BunkBed != null) {
            return _BunkBed!!
        }
        _BunkBed = ImageVector.Builder(
            name = "BunkBed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 2f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                curveTo(23f, 4.79f, 21.21f, 3f, 19f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                moveTo(6.5f, 2f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 2f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13.56f)
                curveTo(20.41f, 13.21f, 19.73f, 13f, 19f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                moveTo(6.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 17f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 12f)
                close()
            }
        }.build()

        return _BunkBed!!
    }

@Suppress("ObjectPropertyName")
private var _BunkBed: ImageVector? = null
