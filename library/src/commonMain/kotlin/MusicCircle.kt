package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicCircle: ImageVector
    get() {
        if (_MusicCircle != null) {
            return _MusicCircle!!
        }
        _MusicCircle = ImageVector.Builder(
            name = "MusicCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(12.5f)
                curveTo(11.58f, 12.19f, 11.07f, 12f, 10.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 17f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 14.5f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _MusicCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MusicCircle: ImageVector? = null
