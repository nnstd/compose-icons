package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AngleAcute: ImageVector
    get() {
        if (_AngleAcute != null) {
            return _AngleAcute!!
        }
        _AngleAcute = ImageVector.Builder(
            name = "AngleAcute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                horizontalLineTo(4.09f)
                lineTo(14.18f, 4.43f)
                lineTo(15.82f, 5.57f)
                lineTo(11.28f, 12.13f)
                curveTo(12.89f, 12.96f, 14f, 14.62f, 14f, 16.54f)
                curveTo(14f, 16.7f, 14f, 16.85f, 13.97f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                moveTo(7.91f, 17f)
                horizontalLineTo(11.96f)
                curveTo(12f, 16.85f, 12f, 16.7f, 12f, 16.54f)
                curveTo(12f, 15.28f, 11.24f, 14.22f, 10.14f, 13.78f)
                lineTo(7.91f, 17f)
                close()
            }
        }.build()

        return _AngleAcute!!
    }

@Suppress("ObjectPropertyName")
private var _AngleAcute: ImageVector? = null
