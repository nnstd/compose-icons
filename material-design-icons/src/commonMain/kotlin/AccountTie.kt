package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTie: ImageVector
    get() {
        if (_AccountTie != null) {
            return _AccountTie!!
        }
        _AccountTie = ImageVector.Builder(
            name = "AccountTie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(14.21f, 3f, 16f, 4.79f, 16f, 7f)
                reflectiveCurveTo(14.21f, 11f, 12f, 11f)
                reflectiveCurveTo(8f, 9.21f, 8f, 7f)
                reflectiveCurveTo(9.79f, 3f, 12f, 3f)
                moveTo(16f, 13.54f)
                curveTo(16f, 14.6f, 15.72f, 17.07f, 13.81f, 19.83f)
                lineTo(13f, 15f)
                lineTo(13.94f, 13.12f)
                curveTo(13.32f, 13.05f, 12.67f, 13f, 12f, 13f)
                reflectiveCurveTo(10.68f, 13.05f, 10.06f, 13.12f)
                lineTo(11f, 15f)
                lineTo(10.19f, 19.83f)
                curveTo(8.28f, 17.07f, 8f, 14.6f, 8f, 13.54f)
                curveTo(5.61f, 14.24f, 4f, 15.5f, 4f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                curveTo(20f, 15.5f, 18.4f, 14.24f, 16f, 13.54f)
                close()
            }
        }.build()

        return _AccountTie!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTie: ImageVector? = null
