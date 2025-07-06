package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BloodBag: ImageVector
    get() {
        if (_BloodBag != null) {
            return _BloodBag!!
        }
        _BloodBag = ImageVector.Builder(
            name = "BloodBag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                curveTo(20f, 7f, 20f, 6f, 20f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                curveTo(16f, 4.27f, 14.75f, 1f, 10f, 1f)
                curveTo(5.25f, 1f, 4f, 4.27f, 4f, 6f)
                verticalLineTo(19f)
                curveTo(4f, 19.33f, 3.9f, 21f, 2f, 21f)
                verticalLineTo(23f)
                curveTo(4.93f, 23f, 6f, 20.61f, 6f, 19f)
                verticalLineTo(6f)
                curveTo(6f, 5.88f, 6.05f, 3f, 10f, 3f)
                curveTo(13.83f, 3f, 14f, 5.7f, 14f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                curveTo(10f, 6f, 10f, 7f, 9f, 7f)
                curveTo(8f, 7f, 8f, 8f, 8f, 8f)
                verticalLineTo(20f)
                curveTo(8f, 20f, 8f, 22f, 13f, 22f)
                curveTo(13.24f, 22f, 14.13f, 22f, 17f, 22f)
                curveTo(22f, 22f, 22f, 20f, 22f, 20f)
                verticalLineTo(8f)
                curveTo(22f, 8f, 22f, 7f, 21f, 7f)
                moveTo(15f, 19.4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16.4f)
                curveTo(12f, 14.4f, 15f, 11f, 15f, 11f)
                curveTo(15f, 11f, 18f, 14.4f, 18f, 16.4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19.4f)
                close()
            }
        }.build()

        return _BloodBag!!
    }

@Suppress("ObjectPropertyName")
private var _BloodBag: ImageVector? = null
