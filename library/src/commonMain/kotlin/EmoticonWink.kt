package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonWink: ImageVector
    get() {
        if (_EmoticonWink != null) {
            return _EmoticonWink!!
        }
        _EmoticonWink = ImageVector.Builder(
            name = "EmoticonWink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(7f, 9.5f)
                curveTo(7f, 8.7f, 7.7f, 8f, 8.5f, 8f)
                curveTo(9.3f, 8f, 10f, 8.7f, 10f, 9.5f)
                curveTo(10f, 10.3f, 9.3f, 11f, 8.5f, 11f)
                curveTo(7.7f, 11f, 7f, 10.3f, 7f, 9.5f)
                moveTo(12f, 17.23f)
                curveTo(10.25f, 17.23f, 8.71f, 16.5f, 7.81f, 15.42f)
                lineTo(9.23f, 14f)
                curveTo(9.68f, 14.72f, 10.75f, 15.23f, 12f, 15.23f)
                curveTo(13.25f, 15.23f, 14.32f, 14.72f, 14.77f, 14f)
                lineTo(16.19f, 15.42f)
                curveTo(15.29f, 16.5f, 13.75f, 17.23f, 12f, 17.23f)
                moveTo(17f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _EmoticonWink!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonWink: ImageVector? = null
