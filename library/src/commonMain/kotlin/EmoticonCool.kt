package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonCool: ImageVector
    get() {
        if (_EmoticonCool != null) {
            return _EmoticonCool!!
        }
        _EmoticonCool = ImageVector.Builder(
            name = "EmoticonCool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.22f, 7.22f)
                curveTo(4.91f, 4.11f, 8.21f, 2f, 12f, 2f)
                curveTo(15.79f, 2f, 19.09f, 4.11f, 20.78f, 7.22f)
                lineTo(20f, 8f)
                horizontalLineTo(4f)
                lineTo(3.22f, 7.22f)
                moveTo(21.4f, 8.6f)
                curveTo(21.78f, 9.67f, 22f, 10.81f, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2f, 10.81f, 2.22f, 9.67f, 2.6f, 8.6f)
                lineTo(4f, 10f)
                horizontalLineTo(5f)
                curveTo(5f, 11.38f, 7.12f, 12.5f, 8.5f, 12.5f)
                curveTo(9.88f, 12.5f, 11.25f, 11.38f, 11.25f, 10f)
                horizontalLineTo(12.75f)
                curveTo(12.75f, 11.38f, 14.12f, 12.5f, 15.5f, 12.5f)
                curveTo(16.88f, 12.5f, 19f, 11.38f, 19f, 10f)
                horizontalLineTo(20f)
                lineTo(21.4f, 8.6f)
                moveTo(16.19f, 15.42f)
                lineTo(14.77f, 14f)
                curveTo(14.32f, 14.72f, 13.25f, 15.23f, 12f, 15.23f)
                curveTo(10.75f, 15.23f, 9.68f, 14.72f, 9.23f, 14f)
                lineTo(7.81f, 15.42f)
                curveTo(8.71f, 16.5f, 10.25f, 17.23f, 12f, 17.23f)
                curveTo(13.75f, 17.23f, 15.29f, 16.5f, 16.19f, 15.42f)
                close()
            }
        }.build()

        return _EmoticonCool!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonCool: ImageVector? = null
