package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Atlassian: ImageVector
    get() {
        if (_Atlassian != null) {
            return _Atlassian!!
        }
        _Atlassian = ImageVector.Builder(
            name = "Atlassian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.93f, 11.24f)
                curveTo(7.74f, 11f, 7.38f, 10.94f, 7.13f, 11.13f)
                curveTo(7.06f, 11.19f, 7f, 11.26f, 6.96f, 11.34f)
                lineTo(2.06f, 21.15f)
                curveTo(1.91f, 21.44f, 2.03f, 21.79f, 2.32f, 21.94f)
                curveTo(2.4f, 22f, 2.5f, 22f, 2.59f, 22f)
                horizontalLineTo(9.41f)
                curveTo(9.63f, 22f, 9.84f, 21.88f, 9.94f, 21.68f)
                curveTo(11.41f, 18.63f, 10.5f, 14f, 7.93f, 11.24f)
                moveTo(11.53f, 2.31f)
                curveTo(9.05f, 6.14f, 8.76f, 11f, 10.77f, 15.09f)
                lineTo(14.06f, 21.68f)
                curveTo(14.17f, 21.88f, 14.37f, 22f, 14.59f, 22f)
                horizontalLineTo(21.41f)
                arcTo(0.59f, 0.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 21.41f)
                curveTo(22f, 21.32f, 22f, 21.23f, 21.94f, 21.15f)
                curveTo(21.94f, 21.15f, 12.76f, 2.77f, 12.5f, 2.31f)
                curveTo(12.39f, 2.04f, 12.06f, 1.92f, 11.78f, 2.06f)
                curveTo(11.67f, 2.11f, 11.58f, 2.2f, 11.53f, 2.31f)
                close()
            }
        }.build()

        return _Atlassian!!
    }

@Suppress("ObjectPropertyName")
private var _Atlassian: ImageVector? = null
