package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TestTube: ImageVector
    get() {
        if (_TestTube != null) {
            return _TestTube!!
        }
        _TestTube = ImageVector.Builder(
            name = "TestTube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                moveTo(11f, 16f)
                curveTo(10.4f, 16f, 10f, 15.6f, 10f, 15f)
                curveTo(10f, 14.4f, 10.4f, 14f, 11f, 14f)
                curveTo(11.6f, 14f, 12f, 14.4f, 12f, 15f)
                curveTo(12f, 15.6f, 11.6f, 16f, 11f, 16f)
                moveTo(13f, 12f)
                curveTo(12.4f, 12f, 12f, 11.6f, 12f, 11f)
                curveTo(12f, 10.4f, 12.4f, 10f, 13f, 10f)
                curveTo(13.6f, 10f, 14f, 10.4f, 14f, 11f)
                curveTo(14f, 11.6f, 13.6f, 12f, 13f, 12f)
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _TestTube!!
    }

@Suppress("ObjectPropertyName")
private var _TestTube: ImageVector? = null
