package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountBadge: ImageVector
    get() {
        if (_AccountBadge != null) {
            return _AccountBadge!!
        }
        _AccountBadge = ImageVector.Builder(
            name = "AccountBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 19.5f)
                curveTo(14f, 17.5f, 15.1f, 15.7f, 16.7f, 14.8f)
                curveTo(15.4f, 14.3f, 13.8f, 14f, 12f, 14f)
                curveTo(7.6f, 14f, 4f, 15.8f, 4f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(19.5f)
                moveTo(19.5f, 16f)
                curveTo(17.6f, 16f, 16f, 17.6f, 16f, 19.5f)
                reflectiveCurveTo(17.6f, 23f, 19.5f, 23f)
                reflectiveCurveTo(23f, 21.4f, 23f, 19.5f)
                reflectiveCurveTo(21.4f, 16f, 19.5f, 16f)
                moveTo(16f, 8f)
                curveTo(16f, 10.2f, 14.2f, 12f, 12f, 12f)
                reflectiveCurveTo(8f, 10.2f, 8f, 8f)
                reflectiveCurveTo(9.8f, 4f, 12f, 4f)
                reflectiveCurveTo(16f, 5.8f, 16f, 8f)
                close()
            }
        }.build()

        return _AccountBadge!!
    }

@Suppress("ObjectPropertyName")
private var _AccountBadge: ImageVector? = null
