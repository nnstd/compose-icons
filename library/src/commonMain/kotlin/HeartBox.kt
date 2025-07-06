package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartBox: ImageVector
    get() {
        if (_HeartBox != null) {
            return _HeartBox!!
        }
        _HeartBox = ImageVector.Builder(
            name = "HeartBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(12f, 17f)
                lineTo(12.72f, 16.34f)
                curveTo(15.3f, 14f, 17f, 12.46f, 17f, 10.57f)
                curveTo(17f, 9.03f, 15.79f, 7.82f, 14.25f, 7.82f)
                curveTo(13.38f, 7.82f, 12.55f, 8.23f, 12f, 8.87f)
                curveTo(11.45f, 8.23f, 10.62f, 7.82f, 9.75f, 7.82f)
                curveTo(8.21f, 7.82f, 7f, 9.03f, 7f, 10.57f)
                curveTo(7f, 12.46f, 8.7f, 14f, 11.28f, 16.34f)
                lineTo(12f, 17f)
                close()
            }
        }.build()

        return _HeartBox!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBox: ImageVector? = null
