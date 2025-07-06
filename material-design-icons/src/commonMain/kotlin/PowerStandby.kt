package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerStandby: ImageVector
    get() {
        if (_PowerStandby != null) {
            return _PowerStandby!!
        }
        _PowerStandby = ImageVector.Builder(
            name = "PowerStandby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(17.83f, 5.17f)
                lineTo(16.41f, 6.59f)
                curveTo(18.05f, 7.91f, 19f, 9.9f, 19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                curveTo(8.14f, 19f, 5f, 15.88f, 5f, 12f)
                curveTo(5f, 9.91f, 5.95f, 7.91f, 7.58f, 6.58f)
                lineTo(6.17f, 5.17f)
                curveTo(2.38f, 8.39f, 1.92f, 14.07f, 5.14f, 17.86f)
                curveTo(8.36f, 21.64f, 14.04f, 22.1f, 17.83f, 18.88f)
                curveTo(19.85f, 17.17f, 21f, 14.65f, 21f, 12f)
                curveTo(21f, 9.37f, 19.84f, 6.87f, 17.83f, 5.17f)
                close()
            }
        }.build()

        return _PowerStandby!!
    }

@Suppress("ObjectPropertyName")
private var _PowerStandby: ImageVector? = null
