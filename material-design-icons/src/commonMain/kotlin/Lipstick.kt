package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lipstick: ImageVector
    get() {
        if (_Lipstick != null) {
            return _Lipstick!!
        }
        _Lipstick = ImageVector.Builder(
            name = "Lipstick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 23f)
                curveTo(8.45f, 23f, 8f, 22.55f, 8f, 22f)
                verticalLineTo(13f)
                curveTo(8f, 12.45f, 8.45f, 12f, 9f, 12f)
                horizontalLineTo(15f)
                curveTo(15.55f, 12f, 16f, 12.45f, 16f, 13f)
                verticalLineTo(22f)
                curveTo(16f, 22.55f, 15.55f, 23f, 15f, 23f)
                horizontalLineTo(9f)
                moveTo(10f, 11f)
                curveTo(9.45f, 11f, 9f, 10.55f, 9f, 10f)
                verticalLineTo(5.25f)
                curveTo(9f, 5.25f, 11f, 3f, 11.75f, 1f)
                curveTo(12.83f, 1.67f, 13.92f, 2.33f, 14.46f, 3.83f)
                curveTo(15f, 5.33f, 15f, 7.67f, 15f, 10f)
                curveTo(15f, 10.55f, 14.55f, 11f, 14f, 11f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Lipstick!!
    }

@Suppress("ObjectPropertyName")
private var _Lipstick: ImageVector? = null
