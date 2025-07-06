package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountDetails: ImageVector
    get() {
        if (_AccountDetails != null) {
            return _AccountDetails!!
        }
        _AccountDetails = ImageVector.Builder(
            name = "AccountDetails",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                curveTo(11f, 10.66f, 9.66f, 12f, 8f, 12f)
                curveTo(6.34f, 12f, 5f, 10.66f, 5f, 9f)
                curveTo(5f, 7.34f, 6.34f, 6f, 8f, 6f)
                curveTo(9.66f, 6f, 11f, 7.34f, 11f, 9f)
                moveTo(14f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                curveTo(2f, 15.79f, 4.69f, 14f, 8f, 14f)
                curveTo(11.31f, 14f, 14f, 15.79f, 14f, 18f)
                moveTo(22f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                moveTo(22f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                moveTo(22f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _AccountDetails!!
    }

@Suppress("ObjectPropertyName")
private var _AccountDetails: ImageVector? = null
