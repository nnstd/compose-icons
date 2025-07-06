package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSupervisorCircleOutline: ImageVector
    get() {
        if (_AccountSupervisorCircleOutline != null) {
            return _AccountSupervisorCircleOutline!!
        }
        _AccountSupervisorCircleOutline = ImageVector.Builder(
            name = "AccountSupervisorCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 10f)
                curveTo(12.5f, 8.34f, 11.16f, 7f, 9.5f, 7f)
                curveTo(7.86f, 7f, 6.5f, 8.34f, 6.5f, 10f)
                curveTo(6.5f, 11.64f, 7.86f, 13f, 9.5f, 13f)
                curveTo(11.16f, 13f, 12.5f, 11.64f, 12.5f, 10f)
                moveTo(9.5f, 11f)
                curveTo(8.96f, 11f, 8.5f, 10.54f, 8.5f, 10f)
                curveTo(8.5f, 9.44f, 8.96f, 9f, 9.5f, 9f)
                curveTo(10.06f, 9f, 10.5f, 9.44f, 10.5f, 10f)
                curveTo(10.5f, 10.54f, 10.06f, 11f, 9.5f, 11f)
                moveTo(16f, 13f)
                curveTo(17.12f, 13f, 18f, 12.1f, 18f, 11f)
                curveTo(18f, 9.88f, 17.12f, 9f, 16f, 9f)
                curveTo(14.9f, 9f, 14f, 9.88f, 14f, 11f)
                curveTo(14f, 12.1f, 14.9f, 13f, 16f, 13f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(5.85f, 17.11f)
                curveTo(6.53f, 16.57f, 8.12f, 16f, 9.5f, 16f)
                curveTo(9.58f, 16f, 9.66f, 16f, 9.74f, 16f)
                curveTo(10f, 15.37f, 10.41f, 14.72f, 11.04f, 14.15f)
                curveTo(10.5f, 14.05f, 9.95f, 14f, 9.5f, 14f)
                curveTo(8.21f, 14f, 6.12f, 14.44f, 4.78f, 15.42f)
                curveTo(4.28f, 14.38f, 4f, 13.22f, 4f, 12f)
                curveTo(4f, 7.58f, 7.59f, 4f, 12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.58f, 20f, 12f)
                curveTo(20f, 13.19f, 19.73f, 14.33f, 19.25f, 15.36f)
                curveTo(18.25f, 14.77f, 16.89f, 14.5f, 16f, 14.5f)
                curveTo(14.5f, 14.5f, 11.5f, 15.3f, 11.5f, 17.19f)
                verticalLineTo(19.97f)
                curveTo(9.24f, 19.84f, 7.22f, 18.76f, 5.85f, 17.11f)
                close()
            }
        }.build()

        return _AccountSupervisorCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSupervisorCircleOutline: ImageVector? = null
