package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Silverware: ImageVector
    get() {
        if (_Silverware != null) {
            return _Silverware!!
        }
        _Silverware = ImageVector.Builder(
            name = "Silverware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.1f, 13.34f)
                lineTo(3.91f, 9.16f)
                curveTo(2.35f, 7.59f, 2.35f, 5.06f, 3.91f, 3.5f)
                lineTo(10.93f, 10.5f)
                lineTo(8.1f, 13.34f)
                moveTo(14.88f, 11.53f)
                lineTo(13.41f, 13f)
                lineTo(20.29f, 19.88f)
                lineTo(18.88f, 21.29f)
                lineTo(12f, 14.41f)
                lineTo(5.12f, 21.29f)
                lineTo(3.71f, 19.88f)
                lineTo(13.47f, 10.12f)
                curveTo(12.76f, 8.59f, 13.26f, 6.44f, 14.85f, 4.85f)
                curveTo(16.76f, 2.93f, 19.5f, 2.57f, 20.96f, 4.03f)
                curveTo(22.43f, 5.5f, 22.07f, 8.24f, 20.15f, 10.15f)
                curveTo(18.56f, 11.74f, 16.41f, 12.24f, 14.88f, 11.53f)
                close()
            }
        }.build()

        return _Silverware!!
    }

@Suppress("ObjectPropertyName")
private var _Silverware: ImageVector? = null
